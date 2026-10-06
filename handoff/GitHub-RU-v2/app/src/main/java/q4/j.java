package q4;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Resources f30958a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f30959b;

    public j(Resources resources, Resources.Theme theme) {
        this.f30958a = resources;
        this.f30959b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f30958a.equals(jVar.f30958a) && Objects.equals(this.f30959b, jVar.f30959b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f30958a, this.f30959b);
    }
}
