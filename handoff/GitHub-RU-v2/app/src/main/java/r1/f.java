package r1;

import androidx.compose.runtime.l2;
import androidx.compose.runtime.m2;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements l2 {

    /* renamed from: r, reason: collision with root package name */
    public Set f31075r;

    /* renamed from: s, reason: collision with root package name */
    public final l1.e f31076s = new l1.e(new m2[16]);

    public f(Set set) {
        this.f31075r = set;
    }

    @Override // androidx.compose.runtime.l2
    public final void a() {
    }

    @Override // androidx.compose.runtime.l2
    public final void b() {
    }

    @Override // androidx.compose.runtime.l2
    public final void c() {
        l1.e eVar = this.f31076s;
        Object[] objArr = eVar.f27901r;
        int i = eVar.f27903t;
        for (int i10 = 0; i10 < i; i10++) {
            l2 l2Var = ((m2) objArr[i10]).f1728a;
            this.f31075r.remove(l2Var);
            l2Var.c();
        }
    }
}
