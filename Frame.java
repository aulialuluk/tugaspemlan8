public class Frame {
    private String title;
    private int width;
    private int height;
    private String layout;
    private boolean isVisible;

    public Frame(String title) {
        this.title = title;
        this.width = 800;
        this.height = 600;
        this.layout = "FlowLayout";
        this.isVisible = false;
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public String getTitle() {
        return title;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getLayout() {
        return layout;
    }

    public boolean isVisible() {
        return isVisible;
    }
}
