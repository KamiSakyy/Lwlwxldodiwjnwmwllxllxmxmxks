package d3;

/* loaded from: /home/user/work/p/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f21432a;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f21432a == ((k) obj).f21432a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21432a);
    }

    public final String toString() {
        int i = this.f21432a;
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : "Unknown";
    }
}
