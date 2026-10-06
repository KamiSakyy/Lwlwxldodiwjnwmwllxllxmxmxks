package d2;

import android.graphics.PathMeasure;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public PathMeasure f21352a;

    public j(PathMeasure pathMeasure) {
        this.f21352a = pathMeasure;
    }

    public final boolean a(float f6, float f10, i iVar) {
        if (iVar == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f21352a.getSegment(f6, f10, iVar.f21346a, true);
    }
}
