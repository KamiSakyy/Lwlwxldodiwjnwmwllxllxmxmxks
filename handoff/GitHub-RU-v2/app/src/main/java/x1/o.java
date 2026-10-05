package x1;

import android.view.ViewStructure;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class o extends k71.l implements j71.g {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ViewStructure f33716s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ViewStructure viewStructure) {
        super(4);
        this.f33716s = viewStructure;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue() - intValue2;
        this.f33716s.setDimens(intValue, intValue2, 0, 0, intValue3 - intValue, intValue4);
        return a0.a;
    }
}
