package k51;

import java.util.Date;
import java.util.HashMap;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements j51.a {
    public static final b f;
    public static final b g;
    public final HashMap a;
    public final HashMap b;
    public final a c;
    public boolean d;
    public static final a e = new a(0);
    public static final c h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [k51.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [k51.b] */
    static {
        final int i = 0;
        f = new i51.e() { // from class: k51.b
            @Override // i51.a
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((i51.f) obj2).b((String) obj);
                        break;
                    default:
                        ((i51.f) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new i51.e() { // from class: k51.b
            @Override // i51.a
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((i51.f) obj2).b((String) obj);
                        break;
                    default:
                        ((i51.f) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    public final j51.a a(Class cls, i51.c cVar) {
        this.a.put(cls, cVar);
        this.b.remove(cls);
        return this;
    }







}
