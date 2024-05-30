public enum Package {
    PLAST("Plast") , GLASS("Glass") , PAPER("Paper");   


private final String matt;

Package(String matt) {
    this.matt = matt;
}

public String getName() {
        return matt;
}
}
