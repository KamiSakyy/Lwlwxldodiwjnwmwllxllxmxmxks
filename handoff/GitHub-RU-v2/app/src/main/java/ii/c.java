package ii;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import k71.k;
import l7.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends n1 {
    public final TextView u;
    public final TextView v;
    public final SwitchMaterial w;

    public c(View view) {
        super(view);
        View findViewById = view.findViewById(2131363438);
        k.f(findViewById, "findViewById(...)");
        this.u = (TextView) findViewById;
        View findViewById2 = view.findViewById(2131363371);
        k.f(findViewById2, "findViewById(...)");
        this.v = (TextView) findViewById2;
        SwitchMaterial findViewById3 = view.findViewById(2131363183);
        k.f(findViewById3, "findViewById(...)");
        this.w = findViewById3;
    }
}
