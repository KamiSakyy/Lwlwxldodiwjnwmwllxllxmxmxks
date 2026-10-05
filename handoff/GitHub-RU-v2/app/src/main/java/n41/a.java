package n41;

import com.google.android.gms.measurement.internal.c2;
import com.google.common.collect.d;
import com.google.common.collect.f;
import com.google.common.collect.h;
import java.util.Arrays;
import m7.y;
import v8.l0;
import w8.s;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final f a;
    public static final h b;
    public static final h c;
    public static final h d;

    static {
        int i = f.t;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        a = f.j(15, objArr);
        com.google.common.collect.b bVar = d.s;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        s.i(7, objArr2);
        b = d.i(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        s.i(3, objArr3);
        c = d.i(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        s.i(2, objArr4);
        d = d.i(2, objArr4);
        y.q("initialCapacity", 4);
        String[] strArr = c2.i;
        s.i(15, strArr);
        Object[] copyOf = Arrays.copyOf(new Object[4], l0.w(4, 15));
        System.arraycopy(strArr, 0, copyOf, 0, 15);
        String[] strArr2 = c2.j;
        s.i(15, strArr2);
        if (copyOf.length < 30) {
            copyOf = Arrays.copyOf(copyOf, l0.w(copyOf.length, 30));
        }
        System.arraycopy(strArr2, 0, copyOf, 15, 15);
        d.i(30, copyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        s.i(2, objArr5);
        d.i(2, objArr5);
    }
}
