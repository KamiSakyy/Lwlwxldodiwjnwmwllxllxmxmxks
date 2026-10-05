package x4;

import java.util.List;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f33750a;

    /* renamed from: b, reason: collision with root package name */
    public String f33751b;

    /* renamed from: c, reason: collision with root package name */
    public List f33752c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f33750a, aVar.f33750a) && Objects.equals(this.f33751b, aVar.f33751b) && Objects.equals(this.f33752c, aVar.f33752c);
    }

    public final int hashCode() {
        return Objects.hash(this.f33750a, this.f33751b, this.f33752c);
    }
}
