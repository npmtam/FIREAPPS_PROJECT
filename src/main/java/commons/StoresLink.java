package commons;

public class StoresLink {
    private String url;
    private String store_type;
    private String email;
    private String storeName;
    private String dateTime;
    private String country;
    private String address;

    public StoresLink(String url, String email, String storeName, String store_type, String country, String address, String dateTime) {
        super();
        this.url = url;
        this.email = email;
        this.storeName = storeName;
        this.store_type = store_type;
        this.country = country;
        this.address = address;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return url + ", " + email + ", " + storeName + ", " + store_type + ", " + country + ", " + address + ", " + dateTime;
    }

    public String getUrl() {
        return url;
    }

    public String getStore_type() {
        return store_type;
    }

    public String getEmail() {
        return email;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getCountry(){
        return country;
    }

    public String getAddress(){
        return address;
    }

    public String getDateTime(){
        return dateTime;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setStore_type(String store_type) {
        this.store_type = store_type;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setDateTime(String dateTime){
        this.dateTime = dateTime;
    }
}
