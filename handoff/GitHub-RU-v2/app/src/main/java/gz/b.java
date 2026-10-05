package gz;

import com.github.service.dotcom.models.response.copilot.AiModelCapabilityTypeResponse$Companion;
import sy.w;
import v8.l0;
import w61.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final AiModelCapabilityTypeResponse$Companion Companion;
    public static final Object r;
    public static final b s;
    public static final /* synthetic */ b[] t;

    static {
        b bVar = new b("CHAT", 0);
        b bVar2 = new b("UNKNOWN", 1);
        s = bVar2;
        b[] bVarArr = {bVar, bVar2};
        t = bVarArr;
        l0.t(bVarArr);
        Companion = new AiModelCapabilityTypeResponse$Companion();
        r = w.s(i.r, new a(11));
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) t.clone();
    }
}
