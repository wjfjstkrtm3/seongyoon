package kr.or.bit.action;

public class ActionForward {
  private boolean isRedirect = false; // 화면단제어
  private String path = null; // 이동경로
  public boolean isRedirect() {
    return isRedirect;
  }
  public void setRedirect(boolean isRedirect) {
    this.isRedirect = isRedirect;
  }
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }
  @Override
  public String toString() {
    return "ActionForward [isRedirect=" + isRedirect + ", path=" + path + "]";
  }
}
