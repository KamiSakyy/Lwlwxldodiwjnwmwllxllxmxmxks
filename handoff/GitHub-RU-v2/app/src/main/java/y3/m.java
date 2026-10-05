package y3;

import android.os.Handler;
import androidx.compose.runtime.l2;
import androidx.fragment.app.i0;
import e7.t;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class m implements l2 {

    /* renamed from: r, reason: collision with root package name */
    public final k f34221r;

    /* renamed from: s, reason: collision with root package name */
    public Handler f34222s;

    /* renamed from: t, reason: collision with root package name */
    public final t f34223t = new t(new l(this, 0));

    /* renamed from: u, reason: collision with root package name */
    public boolean f34224u = true;

    /* renamed from: v, reason: collision with root package name */
    public final l f34225v = new l(this, 1);

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f34226w = new ArrayList();

    public m(k kVar) {
        this.f34221r = kVar;
    }

    @Override // androidx.compose.runtime.l2
    public final void a() {
    }

    @Override // androidx.compose.runtime.l2
    public final void b() {
        t tVar = this.f34223t;
        i0 i0Var = (i0) tVar.i;
        if (i0Var != null) {
            i0Var.a();
        }
        tVar.a();
    }

    @Override // androidx.compose.runtime.l2
    public final void c() {
        this.f34223t.f();
    }
}
