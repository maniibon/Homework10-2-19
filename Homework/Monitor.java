package Homework;

public class Monitor {
    private int model;
    private int manufacturer;
    private int size;
    private int nativeResolution;

    public Monitor(int model, int manufacturer, int size, int nativeResolution) {
    this.model =model;
    this.manufacturer =manufacturer;
    this.size = size;
    this.nativeResolution = nativeResolution;
}

    public int getModel() { return model;
    }

    public int getManufacturer() { return manufacturer;
    }


    public int getSize() { return size;
    }

    public int getNativeResolution() { return nativeResolution;
    }

    void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at"+ x +","+ y + " "+" in color"+ color);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void drawPixelAt() {
    }
}
