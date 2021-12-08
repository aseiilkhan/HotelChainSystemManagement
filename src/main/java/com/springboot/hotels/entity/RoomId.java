package com.springboot.hotels.entity;
import java.io.Serializable;
import java.util.Objects;

public class RoomId implements Serializable {

	private int hotelRoomTypeId;
    private int roomNumber;

    public RoomId() {
    }

    public RoomId(int hotelRoomTypeId, int roomNumber) {
        this.hotelRoomTypeId = hotelRoomTypeId;
        this.roomNumber = roomNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomId roomId = (RoomId) o;
        return hotelRoomTypeId == roomId.hotelRoomTypeId &&
                roomNumber == roomId.roomNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotelRoomTypeId, roomNumber);
    }
}