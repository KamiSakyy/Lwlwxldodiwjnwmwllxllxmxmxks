package gz;

import com.github.service.dotcom.models.response.copilot.ModelPickerCategoryResponse$Companion;
import sy.w;
import v8.l0;
import w61.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public class e {
    public static final ModelPickerCategoryResponse$Companion Companion;
    public static final Object r;
    public static final e s;
    public static final /* synthetic */ e[] t;

    static {
        e eVar = new e("LIGHTWEIGHT", 0);
        e eVar2 = new e("VERSATILE", 1);
        e eVar3 = new e("POWERFUL", 2);
        e eVar4 = new e("UNKNOWN", 3);
        s = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        t = eVarArr;
        l0.t(eVarArr);
        Companion = new ModelPickerCategoryResponse$Companion();
        r = w.s(i.r, new a(18));
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) t.clone();
    }
}
