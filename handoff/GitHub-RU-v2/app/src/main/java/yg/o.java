package yg;

import androidx.compose.runtime.b2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o {
    public static final void a(int i, androidx.compose.runtime.s sVar, j71.a aVar, String str, String str2, w1.r rVar) {
        int i2;
        w1.r rVar2;
        k71.k.g(str, "label");
        k71.k.g(aVar, "onClick");
        sVar.e0(642433414);
        if ((i & 6) == 0) {
            i2 = (sVar.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            rVar2 = rVar;
            i2 |= sVar.f(rVar2) ? 2048 : 1024;
        } else {
            rVar2 = rVar;
        }
        if (sVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 << 3;
            n.a(rVar2, str, true, aVar, str2, new d3.k(0), null, null, 0.0f, null, c.a, false, sVar, ((i2 >> 9) & 14) | 384 | (i3 & 112) | (i3 & 7168) | ((i2 << 9) & 57344), 6, 3008);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.repository.file.d(str, str2, aVar, rVar, i);
        }
    }
    public Object a(Object p1, Object p2) { return null; }
    public static final Object a = null;
}
