package l81;

import a5.n1;
import b21.v;
import com.google.android.gms.internal.measurement.n4;
import kotlinx.serialization.KSerializer;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class c {
    public static final b d = new b(new h(false, false, false, true, "    ", false, "type", true, a.s), kotlinx.serialization.modules.e.a);
    public final h a;
    public final b21.l b;
    public final kk.a c = new kk.a(8);

    public c(h hVar, b21.l lVar) {
        this.a = hVar;
        this.b = lVar;
    }

    public final Object a(String str, KSerializer kSerializer) {
        k71.k.g(kSerializer, "deserializer");
        k71.k.g(str, "string");
        a7.q qVar = new a7.q(str);
        Object u = new m81.q(this, m81.u.t, qVar, kSerializer.getDescriptor(), null).u(kSerializer);
        if (qVar.i() == 10) {
            return u;
        }
        a7.q.s(qVar, "Expected EOF after parsing, but had " + str.charAt(qVar.b - 1) + " instead", 0, (String) null, 6);
        throw null;
    }

    public final String b(KSerializer kSerializer, Object obj) {
        char[] cArr;
        k71.k.g(kSerializer, "serializer");
        v vVar = new v(6, (byte) 0);
        m81.c cVar = m81.c.t;
        synchronized (cVar) {
            x61.k kVar = (x61.k) ((n1) cVar).s;
            cArr = null;
            char[] cArr2 = (char[]) (kVar.isEmpty() ? null : kVar.removeLast());
            if (cArr2 != null) {
                ((n1) cVar).r -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        vVar.t = cArr;
        try {
            new m81.r(new n4(vVar, (byte) 0), this, m81.u.t, new m81.r[m81.u.y.a()]).n(kSerializer, obj);
            return vVar.toString();
        } finally {
            vVar.s();
        }
    }

    public c(Object... a) {
    }
}
