package n11;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import l51.h;
import l7.x1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public final x1 a;
    public final h b;
    public final HashMap c;

    public e(Context context, h hVar) {
        x1 x1Var = new x1(context);
        this.c = new HashMap();
        this.a = x1Var;
        this.b = hVar;
    }

    public final synchronized g a(String str) {
        if (this.c.containsKey(str)) {
            return (g) this.c.get(str);
        }
        CctBackendFactory s = this.a.s(str);
        if (s == null) {
            return null;
        }
        h hVar = this.b;
        g create = s.create(new b((Context) hVar.s, (v11.a) hVar.t, (v11.a) hVar.u, str));
        this.c.put(str, create);
        return create;
    }
}
