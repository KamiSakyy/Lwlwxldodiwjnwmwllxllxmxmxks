package zh;

import com.github.rudroid.support.u;
import k71.k;
import org.json.JSONObject;
import zh.h;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements h.a {
    public u a;

    public d(u uVar) {
        this.a = uVar;
    }

    @Override // zh.h.a
    public final void a(JSONObject jSONObject) {
        Object obj = jSONObject.get("suggestionId");
        k.e(obj, "null cannot be cast to non-null type kotlin.String");
        this.a.k((String) obj);
    }
}
