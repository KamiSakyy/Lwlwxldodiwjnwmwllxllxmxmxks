package m11;

import androidx.lifecycle.l1;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements j11.f {
    public Set a;
    public j b;
    public s c;

    public q(Set set, j jVar, s sVar) {
        this.a = set;
        this.b = jVar;
        this.c = sVar;
    }

    public final l1 a(String str, j11.c cVar, j11.e eVar) {
        Set set = this.a;
        if (set.contains(cVar)) {
            return new l1(this.b, str, cVar, eVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
    public Object A = null;
    public Object E = null;
    public Object F = null;
    public Object t = null;
    public Object v = null;
    public Object w = null;
    public Object y = null;
    public Object z = null;
    public Object F0() { return null; }
    public Object K0() { return null; }
    public Object L0() { return null; }
    public Object N0(Object) { return null; }
}
