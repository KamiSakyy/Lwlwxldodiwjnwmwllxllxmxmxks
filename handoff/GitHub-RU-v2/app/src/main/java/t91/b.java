package t91;

import k71.l;
import k71.u;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b extends l implements j71.c {
    public final /* synthetic */ u s;
    public final /* synthetic */ u t;
    public final /* synthetic */ String u;
    public final /* synthetic */ u v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(u uVar, u uVar2, String str, u uVar3) {
        super(1);
        this.s = uVar;
        this.t = uVar2;
        this.u = str;
        this.v = uVar3;
    }

    public final Object k(Object obj) {
        boolean z;
        String str;
        int i;
        int intValue = ((Number) obj).intValue();
        u uVar = this.s;
        int i2 = uVar.r;
        u uVar2 = this.t;
        int i3 = uVar2.r;
        while (true) {
            int i4 = uVar.r;
            z = true;
            str = this.u;
            if (i4 >= intValue || uVar2.r >= str.length()) {
                break;
            }
            char charAt = str.charAt(uVar2.r);
            u uVar3 = this.v;
            if (charAt != ' ') {
                if (charAt != '\t') {
                    break;
                }
                i = 4 - (uVar3.r % 4);
            } else {
                i = 1;
            }
            uVar.r += i;
            uVar3.r += i;
            uVar2.r++;
        }
        if (uVar2.r == str.length()) {
            uVar.r = Integer.MAX_VALUE;
        }
        int i5 = uVar.r;
        if (intValue <= i5) {
            uVar.r = i5 - intValue;
        } else {
            uVar2.r = i3;
            uVar.r = i2;
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
