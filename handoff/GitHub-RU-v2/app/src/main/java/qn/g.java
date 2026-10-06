package qn;

import android.util.Base64;
import java.util.List;
import k71.k;
import org.json.JSONObject;
import t71.p;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public String a;
    public List b;
    public String c;

    public g(String str, List list) {
        String concat;
        k.g(str, "subscriptionID");
        k.g(list, "filterIds");
        this.a = str;
        this.b = list;
        String str2 = "";
        try {
            byte[] decode = Base64.decode(p.p0(str, "--"), 0);
            if (decode != null && (concat = p.p0(new String(decode, t71.a.a), "}").concat("}")) != null) {
                String optString = new JSONObject(concat).optString("c");
                if (optString != null) {
                    str2 = optString;
                }
            }
        } catch (Exception unused) {
        }
        this.c = str2;
    }

    public final boolean a(d dVar) {
        k.g(dVar, "message");
        String str = dVar.a;
        String str2 = this.c;
        if (str2.length() > 0) {
            return str.equals(str2);
        }
        f fVar = dVar.c;
        String str3 = fVar.b;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = fVar.c;
        String str5 = str4 != null ? str4 : "";
        List<String> list = this.b;
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (String str6 : list) {
            if (p.I(str, str6, false) || p.I(str3, str6, false) || k.b(str6, str5)) {
                return true;
            }
        }
        return false;
    }
}
