package u1;

import androidx.compose.runtime.l2;
import v1.o;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements l2 {

    /* renamed from: r, reason: collision with root package name */
    public i f32180r;

    /* renamed from: s, reason: collision with root package name */
    public e f32181s;

    /* renamed from: t, reason: collision with root package name */
    public String f32182t;

    /* renamed from: u, reason: collision with root package name */
    public Object f32183u;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f32184v;

    /* renamed from: w, reason: collision with root package name */
    public d f32185w;

    /* renamed from: x, reason: collision with root package name */
    public final ma.a f32186x = new ma.a(24, this);

    public a(i iVar, e eVar, String str, Object obj, Object[] objArr) {
        this.f32180r = iVar;
        this.f32181s = eVar;
        this.f32182t = str;
        this.f32183u = obj;
        this.f32184v = objArr;
    }

    @Override // androidx.compose.runtime.l2
    public final void a() {
        l51.h hVar = this.f32185w;
        if (hVar != null) {
            hVar.M();
        }
    }

    @Override // androidx.compose.runtime.l2
    public final void b() {
        l51.h hVar = this.f32185w;
        if (hVar != null) {
            hVar.M();
        }
    }

    @Override // androidx.compose.runtime.l2
    public final void c() {
        d();
    }

    public final void d() {
        String a10;
        e eVar = this.f32181s;
        if (this.f32185w != null) {
            throw new IllegalArgumentException(("entry(" + this.f32185w + ") is not null").toString());
        }
        if (eVar != null) {
            ma.a aVar = this.f32186x;
            Object a11 = aVar.a();
            if (a11 == null || eVar.a(a11)) {
                this.f32185w = eVar.d(this.f32182t, aVar);
                return;
            }
            if (a11 instanceof o) {
                o oVar = (o) a11;
                if (oVar.h() == androidx.compose.runtime.i.f1670u || oVar.h() == androidx.compose.runtime.i.f1673x || oVar.h() == androidx.compose.runtime.i.f1671v) {
                    a10 = "MutableState containing " + oVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    a10 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                a10 = j.a(a11);
            }
            throw new IllegalArgumentException(a10);
        }
    }
}
