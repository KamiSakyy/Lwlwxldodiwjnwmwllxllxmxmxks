package a5;

import android.text.TextUtils;
import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public final class o0 extends q0 {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f451v;

    public o0(int i, Class cls, int i10, int i11, int i12) {
        this.f451v = i12;
        this.f466r = i;
        this.f469u = cls;
        this.f468t = i10;
        this.f467s = i11;
    }

    @Override // a5.q0
    public final Object c(View view) {
        switch (this.f451v) {
            case k5.f.J:
                return Boolean.valueOf(x0.c(view));
            case 1:
                return x0.a(view);
            case 2:
                return z0.b(view);
            default:
                return Boolean.valueOf(x0.b(view));
        }
    }

    @Override // a5.q0
    public final void d(View view, Object obj) {
        switch (this.f451v) {
            case k5.f.J:
                x0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                x0.e(view, (CharSequence) obj);
                break;
            case 2:
                z0.c(view, (CharSequence) obj);
                break;
            default:
                x0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // a5.q0
    public final boolean g(Object obj, Object obj2) {
        boolean equals;
        switch (this.f451v) {
            case k5.f.J:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !equals;
    }
}
