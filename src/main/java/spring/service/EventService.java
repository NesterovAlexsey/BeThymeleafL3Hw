package spring.service;

import org.springframework.stereotype.Service;
import spring.domain.Event;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

  static List<Event> events = new ArrayList<Event>();
    {
      events.add(new Event("Opera", "London"));
      events.add(new Event("Violin concert", "Prague"));
      events.add(new Event("Jazz concert", "Berlin"));
      events.add(new Event("Art exhibition", "London"));
  };

  public List<Event> findAll() {
    return events;
  }

  public void add(Event event) {
    events.add(event);
  }

  public List<String> getListOfCity() {
    List<String> listOfCity = new ArrayList<>();
    for (Event i : events) {
      listOfCity.add(i.getCity());
    }
    return listOfCity;
  }

  public Event get(Integer id) {
    return events.get(id);
  }

  public void update(Integer id, Event event) {
    Event updateEvent = events.get(id);
    updateEvent.setName(event.getName());
    updateEvent.setCity(event.getCity());
  }

  public void remove(int id) {
    events.remove(id);
  }
}
