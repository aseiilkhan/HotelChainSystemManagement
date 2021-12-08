package com.springboot.hotels.entity;
import java.io.Serializable;
import java.util.Objects;

public class RoomTypeId implements Serializable {

	private int hotelId;
    private String typeName;

    public RoomTypeId() {
    }

    public RoomTypeId(int hotelId, String typeName) {
        this.hotelId = hotelId;
        this.typeName = typeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomTypeId x = (RoomTypeId) o;
        return hotelId == x.hotelId &&
                typeName.equals(x.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotelId, typeName);
    }
}