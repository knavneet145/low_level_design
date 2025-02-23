package com.lld.MovieTicketBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private final String theaterId;
    private final int seatingCapacity;
    private final List<String> showsIds;

    public Theater(String theaterId, int seatingCapacity) {
        this.theaterId = theaterId;
        this.seatingCapacity = seatingCapacity;
        this.showsIds = new ArrayList<>();
    }

    public String getTheaterId() {
        return theaterId;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public List<String> getShowsIds() {
        return showsIds;
    }

    public void addShow(String showId) {
        showsIds.add(showId);
    }
}
