package hz;

import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventDataTypeResponse$Companion;
import sy.w;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public static final ChatServerSentEventDataTypeResponse$Companion Companion;
    public static final Object r;
    public static final i s;
    public static final i t;
    public static final i u;
    public static final i v;
    public static final i w;
    public static final i x;
    public static final i y;
    public static final /* synthetic */ i[] z;

    static {
        i iVar = new i("DEBUG", 0);
        s = iVar;
        i iVar2 = new i("CONFIRMATION", 1);
        t = iVar2;
        i iVar3 = new i("FUNCTION_CALL", 2);
        u = iVar3;
        i iVar4 = new i("CONTENT", 3);
        v = iVar4;
        i iVar5 = new i("COMPLETE", 4);
        w = iVar5;
        i iVar6 = new i("ERROR", 5);
        x = iVar6;
        i iVar7 = new i("UNKNOWN", 6);
        y = iVar7;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7};
        z = iVarArr;
        l0.t(iVarArr);
        Companion = new ChatServerSentEventDataTypeResponse$Companion();
        r = w.s(w61.i.r, new e(28));
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) z.clone();
    }
    public Object s(Object p1, Object p2) { return null; }
}
