package s;

import java.util.HashMap;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends f {

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f31370v = new HashMap();

    @Override // s.f
    public final c a(Object obj) {
        return (c) this.f31370v.get(obj);
    }

    @Override // s.f
    public final Object b(Object obj) {
        Object b10 = super.b(obj);
        this.f31370v.remove(obj);
        return b10;
    }
}
