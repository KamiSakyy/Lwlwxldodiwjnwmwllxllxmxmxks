package ba;

import a0.m0;
import h91.i;
import h91.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import sy.d0;
import sy.w;
import v8.l0;
import w61.p;
import x61.n;
import x61.x;

/* loaded from: /home/user/work/p/classes.dex */
public final class h implements d {

    /* renamed from: r, reason: collision with root package name */
    public Map f3872r;

    /* renamed from: s, reason: collision with root package name */
    public k f3873s;

    /* renamed from: t, reason: collision with root package name */
    public String f3874t;

    /* renamed from: u, reason: collision with root package name */
    public String f3875u;

    /* renamed from: v, reason: collision with root package name */
    public p f3876v;

    public h(Map map, k kVar) {
        k71.k.g(map, "uploads");
        k71.k.g(kVar, "operationByteString");
        this.f3872r = map;
        this.f3873s = kVar;
        UUID randomUUID = UUID.randomUUID();
        k71.k.f(randomUUID, "randomUUID(...)");
        String uuid = randomUUID.toString();
        k71.k.f(uuid, "toString(...)");
        this.f3874t = uuid;
        this.f3875u = "multipart/form-data; boundary=".concat(uuid);
        this.f3876v = w.t(new m0(9, this));
    }

    public final void a(i iVar) {
        StringBuilder sb2 = new StringBuilder("--");
        String str = this.f3874t;
        sb2.append(str);
        sb2.append("\r\n");
        iVar.d0(sb2.toString());
        iVar.d0("Content-Disposition: form-data; name=\"operations\"\r\n");
        iVar.d0("Content-Type: application/json\r\n");
        StringBuilder sb3 = new StringBuilder("Content-Length: ");
        k kVar = this.f3873s;
        sb3.append(kVar.d());
        sb3.append("\r\n");
        iVar.d0(sb3.toString());
        iVar.d0("\r\n");
        iVar.p(kVar);
        h91.h hVar = new h91.h();
        ea.a aVar = new ea.a(hVar);
        Map map = this.f3872r;
        Set entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(n.F(entrySet, 10));
        int i = 0;
        for (Object obj : entrySet) {
            int i10 = i + 1;
            if (i < 0) {
                d0.x();
                throw null;
            }
            arrayList.add(new w61.k(String.valueOf(i), d0.n(((Map.Entry) obj).getKey())));
            i = i10;
        }
        l0.U(aVar, x.A(arrayList));
        k v4 = hVar.v(hVar.s);
        iVar.d0("\r\n--" + str + "\r\n");
        iVar.d0("Content-Disposition: form-data; name=\"map\"\r\n");
        iVar.d0("Content-Type: application/json\r\n");
        iVar.d0("Content-Length: " + v4.d() + "\r\n");
        iVar.d0("\r\n");
        iVar.p(v4);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            iVar.d0("\r\n--" + str + "--\r\n");
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        iVar.d0("\r\n--" + str + "\r\n");
        iVar.d0("Content-Disposition: form-data; name=\"0\"");
        throw null;
    }

    @Override // ba.d
    public final long b() {
        return ((Number) this.f3876v.getValue()).longValue();
    }

    @Override // ba.d
    public final String c() {
        return this.f3875u;
    }

    @Override // ba.d
    public final void d(i iVar) {
        a(iVar);
    }
}
