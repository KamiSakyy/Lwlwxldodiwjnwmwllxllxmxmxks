package gz;

import com.github.service.dotcom.models.response.copilot.AiModelCapabilityTypeResponse$Companion;
import sy.w;
import v8.l0;
import w61.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class bShadow {
    public static final AiModelCapabilityTypeResponse$Companion Companion;
    public static final Object r;
    public static final bShadow s;
    public static final /* synthetic */ bShadow[] t;

    static {
        bShadow bVar = new bShadow("CHAT", 0);
        bShadow bVar2 = new bShadow("UNKNOWN", 1);
        s = bVar2;
        bShadow[] bVarArr = {bVar, bVar2};
        t = bVarArr;
        l0.t(bVarArr);
        Companion = new AiModelCapabilityTypeResponse$Companion();
        r = w.s(i.r, new a(11));
    }

    public static b valueOf(String str) {
        return (bShadow) Enum.valueOf(bShadow.class, str);
    }

    public static bShadow[] values() {
        return (bShadow[]) t.clone();
    }
    public Object a = null;
}
