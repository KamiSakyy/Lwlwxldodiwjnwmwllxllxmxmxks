package w6;

import androidx.fragment.app.c1;
import androidx.lifecycle.k1;
import x.r0;

/* loaded from: /home/user/work/p/classes.dex */
public class a extends k1 {

    /* renamed from: t, reason: collision with root package name */
    public static final c1 f33362t = new c1(1);

    /* renamed from: s, reason: collision with root package name */
    public final r0 f33363s = new r0(0);

    @Override // androidx.lifecycle.k1
    public final void O() {
        r0 r0Var = this.f33363s;
        if (r0Var.h() > 0) {
            r0Var.i(0).getClass();
            throw new ClassCastException();
        }
        int i = r0Var.f33618u;
        Object[] objArr = r0Var.f33617t;
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = null;
        }
        r0Var.f33618u = 0;
        r0Var.f33615r = false;
    }
}
