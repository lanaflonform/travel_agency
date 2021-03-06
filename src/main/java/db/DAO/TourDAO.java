package db.DAO;

import db.entity.Tour;
import exception.DatabaseException;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface TourDAO {

    void addTour(Connection connection, Tour tour) throws SQLException;

    List<Tour> getAllTours() throws DatabaseException;

    void deleteTourById(Long id) throws DatabaseException;

    Tour getTourById(Long id) throws DatabaseException;

    void updatePlaceQuantityRowById(Connection connection, long id, int placeQuantity) throws SQLException;

    void updateTour(Tour tour) throws DatabaseException;

    void setHotTourById(long id) throws DatabaseException;

    List<Tour> searchTours(int tourTypeId, float price, int peopleAmount, int stars) throws DatabaseException;
}
