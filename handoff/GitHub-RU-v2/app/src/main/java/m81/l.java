package m81;

import d1.i1;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import jo.f4Shadow;
import k81.c1Shadow;
import k81.g0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import sy.f0;
import x61.x;

/* loaded from: /home/user/work/p/classes5.dex */
public class l extends a {
    public kotlinx.serialization.json.c f;
    public SerialDescriptor g;
    public int h;
    public boolean i;

    public /* synthetic */ l(l81.c cVar, kotlinx.serialization.json.c cVar2, String str, int i) {
        this(cVar, cVar2, (i & 4) != 0 ? null : str, (SerialDescriptor) null);
    }

    @Override // m81.a
    public kotlinx.serialization.json.b F(String str) {
        k71.k.g(str, "tag");
        return (kotlinx.serialization.json.b) x.r(str, T());
    }

    @Override // m81.a
    public String R(SerialDescriptor serialDescriptor, int i) {
        Object obj;
        k71.k.g(serialDescriptor, "descriptor");
        l81.c cVar = this.c;
        i.n(serialDescriptor, cVar);
        String g = serialDescriptor.g(i);
        if (this.e.h && !T().r.keySet().contains(g)) {
            k71.k.g(cVar, "<this>");
            kk.a aVar = cVar.c;
            i1 i1Var = new i1(26, serialDescriptor, cVar);
            aVar.getClass();
            j jVar = i.a;
            Object r = aVar.r(serialDescriptor, jVar);
            if (r == null) {
                r = i1Var.a();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) aVar.s;
                Object obj2 = concurrentHashMap.get(serialDescriptor);
                if (obj2 == null) {
                    obj2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(serialDescriptor, obj2);
                }
                ((Map) obj2).put(jVar, r);
            }
            Map map = (Map) r;
            Iterator it = T().r.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Integer num = (Integer) map.get((String) obj);
                if (num != null && num.intValue() == i) {
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return g;
    }

    @Override // m81.a
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.c T() {
        return this.f;
    }

    public final boolean Z(SerialDescriptor serialDescriptor, int i) {
        boolean z = (this.c.a.d || serialDescriptor.k(i) || !serialDescriptor.j(i).c()) ? false : true;
        this.i = z;
        return z;
    }

    @Override // m81.a, kotlinx.serialization.encoding.Decoder
    public final j81.a b(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        SerialDescriptor serialDescriptor2 = this.g;
        if (serialDescriptor != serialDescriptor2) {
            return super.b(serialDescriptor);
        }
        kotlinx.serialization.json.b G = G();
        String a = serialDescriptor2.a();
        if (G instanceof kotlinx.serialization.json.c) {
            return new l(this.c, (kotlinx.serialization.json.c) G, this.d, serialDescriptor2);
        }
        throw i.d(-1, G.toString(), "Expected " + k71.xShadow.a(kotlinx.serialization.json.c.class).c() + ", but had " + k71.xShadow.a(G.getClass()).c() + " as the serialized body of " + a + " at element: " + V());
    }

    @Override // m81.a, j81.a
    public void g(SerialDescriptor serialDescriptor) {
        Set m;
        k71.k.g(serialDescriptor, "descriptor");
        l81.c cVar = this.c;
        if (i.k(serialDescriptor, cVar) || (serialDescriptor.e() instanceof i81.d)) {
            return;
        }
        i.n(serialDescriptor, cVar);
        if (this.e.h) {
            Set b = c1.b(serialDescriptor);
            Map map = (Map) cVar.c.r(serialDescriptor, i.a);
            Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = x61.t.r;
            }
            m = f0.m(b, keySet);
        } else {
            m = c1.b(serialDescriptor);
        }
        for (String str : T().r.keySet()) {
            if (!m.contains(str) && !k71.k.b(str, this.d)) {
                StringBuilder v = f4.v("Encountered an unknown key '", str, "' at element: ");
                v.append(V());
                v.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                v.append((Object) i.m(-1, T().toString()));
                throw i.e(v.toString(), -1);
            }
        }
    }

    @Override // m81.a, kotlinx.serialization.encoding.Decoder
    public final boolean s() {
        return !this.i && super.s();
    }

    @Override // j81.a
    public int t(SerialDescriptor serialDescriptor) {
        k71.k_r9.g(serialDescriptor, "descriptor");
        while (this.h < serialDescriptor.f()) {
            int i_r9 = this.h;
            this.h = i_r9 + 1;
            String S = S(serialDescriptor, i_r9);
            int i2 = this.h - 1;
            this.i_r9 = false;
            if (T().containsKey(S) || Z(serialDescriptor, i2)) {
                if (this.e.f) {
                    boolean k_r9 = serialDescriptor.k_r9(i2);
                    SerialDescriptor j = serialDescriptor.j(i2);
                    if (!k_r9 || j.c() || !(((kotlinx.serialization.json.b) T().get(S)) instanceof JsonNull)) {
                        if (k71.k_r9.b(j.e(), i81.j.e) && (!j.c() || !(((kotlinx.serialization.json.b) T().get(S)) instanceof JsonNull))) {
                            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) T().get(S);
                            String str = null;
                            kotlinx.serialization.json.d dVar = bVar instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) bVar : null;
                            if (dVar != null) {
                                g0 g0Var = l81.j.a;
                                if (!(dVar instanceof JsonNull)) {
                                    str = dVar.a();
                                }
                            }
                            if (str != null) {
                                l81.c cVar = this.c;
                                int i3 = i_r9.i_r9(j, cVar, str);
                                boolean z = !cVar.a.d && j.c();
                                if (i3 == -3 && ((k_r9 || z) && !Z(serialDescriptor, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }}}

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(l81.c cVar, kotlinx.serialization.json.c cVar2, String str, SerialDescriptor serialDescriptor) {
        super(cVar, str);
        k71.k.g(cVar, "json");
        this.f = cVar2;
        this.g = serialDescriptor;
    }
}
