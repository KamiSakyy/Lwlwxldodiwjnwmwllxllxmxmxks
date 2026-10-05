package r1;

import androidx.compose.runtime.m3;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.y1;
import b21.v;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends o1.c implements v1 {

    /* renamed from: u, reason: collision with root package name */
    public static final h f31078u = new h(o1.m.f29930e, 0);

    @Override // o1.c
    /* renamed from: a */
    public final o1.e builder() {
        g gVar = new g(this);
        gVar.f31077x = this;
        return gVar;
    }

    @Override // o1.c, m1.d
    public final m1.c builder() {
        g gVar = new g(this);
        gVar.f31077x = this;
        return gVar;
    }

    public final h c(y1 y1Var, m3 m3Var) {
        v u8 = this.f29907r.u(y1Var, y1Var.hashCode(), m3Var, 0);
        return u8 == null ? this : new h((o1.m) u8.t, this.f29908s + u8.s);
    }

    @Override // o1.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof y1) {
            return super.containsKey((y1) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof m3) {
            return super.containsValue((m3) obj);
        }
        return false;
    }

    @Override // o1.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof y1) {
            return (m3) super.get((y1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof y1) ? obj2 : (m3) super.getOrDefault((y1) obj, (m3) obj2);
    }

}
