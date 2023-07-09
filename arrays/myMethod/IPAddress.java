public class IPAddress {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");

    }
}
