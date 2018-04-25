public class Codebeautify {
 Search SearchObject;


 // Getter Methods 

 public Search getSearch() {
  return SearchObject;
 }

 // Setter Methods 

 public void setSearch(Search searchObject) {
  this.SearchObject = searchObject;
 }
}
public class Search {
 Parsererror ParsererrorObject;
 private String script;
 private String total_items;
 private String page_size;
 private String page_count;
 private String page_number;
 private String page_items;
 private String first_item;
 private String last_item;
 private String search_time;
 Events EventsObject;


 // Getter Methods 

 public Parsererror getParsererror() {
  return ParsererrorObject;
 }

 public String getScript() {
  return script;
 }

 public String getTotal_items() {
  return total_items;
 }

 public String getPage_size() {
  return page_size;
 }

 public String getPage_count() {
  return page_count;
 }

 public String getPage_number() {
  return page_number;
 }

 public String getPage_items() {
  return page_items;
 }

 public String getFirst_item() {
  return first_item;
 }

 public String getLast_item() {
  return last_item;
 }

 public String getSearch_time() {
  return search_time;
 }

 public Events getEvents() {
  return EventsObject;
 }

 // Setter Methods 

 public void setParsererror(Parsererror parsererrorObject) {
  this.ParsererrorObject = parsererrorObject;
 }

 public void setScript(String script) {
  this.script = script;
 }

 public void setTotal_items(String total_items) {
  this.total_items = total_items;
 }

 public void setPage_size(String page_size) {
  this.page_size = page_size;
 }

 public void setPage_count(String page_count) {
  this.page_count = page_count;
 }

 public void setPage_number(String page_number) {
  this.page_number = page_number;
 }

 public void setPage_items(String page_items) {
  this.page_items = page_items;
 }

 public void setFirst_item(String first_item) {
  this.first_item = first_item;
 }

 public void setLast_item(String last_item) {
  this.last_item = last_item;
 }

 public void setSearch_time(String search_time) {
  this.search_time = search_time;
 }

 public void setEvents(Events eventsObject) {
  this.EventsObject = eventsObject;
 }
}
public class Events {
 Event EventObject;


 // Getter Methods 

 public Event getEvent() {
  return EventObject;
 }

 // Setter Methods 

 public void setEvent(Event eventObject) {
  this.EventObject = eventObject;
 }
}
public class Event {
 private String title;
 private String url;
 private String _id;


 // Getter Methods 

 public String getTitle() {
  return title;
 }

 public String getUrl() {
  return url;
 }

 public String get_id() {
  return _id;
 }

 // Setter Methods 

 public void setTitle(String title) {
  this.title = title;
 }

 public void setUrl(String url) {
  this.url = url;
 }

 public void set_id(String _id) {
  this._id = _id;
 }
}
public class Parsererror {
 ArrayList < Object > h3 = new ArrayList < Object > ();
 Div DivObject;
 private String _style;


 // Getter Methods 

 public Div getDiv() {
  return DivObject;
 }

 public String get_style() {
  return _style;
 }

 // Setter Methods 

 public void setDiv(Div divObject) {
  this.DivObject = divObject;
 }

 public void set_style(String _style) {
  this._style = _style;
 }
}
public class Div {
 private String _style;
 private String __text;


 // Getter Methods 

 public String get_style() {
  return _style;
 }

 public String get__text() {
  return __text;
 }

 // Setter Methods 

 public void set_style(String _style) {
  this._style = _style;
 }

 public void set__text(String __text) {
  this.__text = __text;
 }
}