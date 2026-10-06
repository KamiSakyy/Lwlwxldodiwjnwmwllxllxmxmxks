package ni;

import java.util.List;
import oi.b;
import oi.c;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public List a;

    public a() {
        this.a = l.r(new c[]{new b("(^[0-9\\-TZ:\\.]+)\\s", 1), new b("(?:##)?\\[(\\w+)]", 0), new oi.a()});
    }

    public a(List list) {
        this.a = list;
    }
}
