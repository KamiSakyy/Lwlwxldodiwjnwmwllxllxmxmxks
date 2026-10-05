package ca1;

import java.nio.charset.Charset;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f implements Cloneable {
    public k r = k.w;
    public Charset s = aa1.a.a;
    public boolean t = true;
    public final int u = 1;
    public final int v = 30;
    public final int w = 1;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        try {
            f fVar = (f) super.clone();
            String name = this.s.name();
            fVar.getClass();
            fVar.s = Charset.forName(name);
            fVar.r = k.valueOf(this.r.name());
            return fVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
