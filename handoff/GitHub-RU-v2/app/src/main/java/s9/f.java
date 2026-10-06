package s9;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.android.gms.internal.measurement.b4;
import v71.l;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements i {

    /* renamed from: r, reason: collision with root package name */
    public View f31773r;

    public f(ImageView imageView) {
        this.f31773r = imageView;
    }

    public static k41.b a(int i, int i10, int i11) {
        if (i == -2) {
            return b.f31766a;
        }
        int i12 = i - i11;
        if (i12 > 0) {
            return new a(i12);
        }
        int i13 = i10 - i11;
        if (i13 > 0) {
            return new a(i13);
        }
        return null;
    }

    public h b() {
        View view = this.f31773r;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        k41.b a10 = a(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (a10 == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        k41.b a11 = a(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (a11 == null) {
            return null;
        }
        return new h(a10, a11);
    }

    @Override // s9.i
    public Object d(g9.f fVar) {
        h b10 = b();
        if (b10 != null) {
            return b10;
        }
        l lVar = new l(1, b4.T(fVar));
        lVar.t();
        ViewTreeObserver viewTreeObserver = this.f31773r.getViewTreeObserver();
        k kVar = new k(this, viewTreeObserver, lVar);
        viewTreeObserver.addOnPreDrawListener(kVar);
        lVar.v(new j(this, viewTreeObserver, kVar));
        Object s2 = lVar.s();
        b71.a aVar = b71.a.r;
        return s2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return k71.k.b(this.f31773r, ((f) obj).f31773r);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f31773r.hashCode() * 31);
    }
}
