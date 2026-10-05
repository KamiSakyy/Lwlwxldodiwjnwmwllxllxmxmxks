package com.github.rudroid.issueorpullrequest.triagesheet.labels;

import android.app.Application;
import android.text.SpannableStringBuilder;
import com.github.rudroid.utilities.s2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import le.k;
import sy.f0;
import yz0.k2;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {
    public static ArrayList a(Application application, Set set, Set set2, Set set3, boolean z10, boolean z11) {
        k71.k.g(set, "selectedList");
        k71.k.g(set2, "selectableList");
        k71.k.g(set3, "suggestedList");
        ArrayList arrayList = new ArrayList();
        if (!z10) {
            arrayList.add(new k.e(2131952995));
            if (set.isEmpty()) {
                arrayList.add(new k.b(4, 2131954850));
            } else {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    k2 k2Var = (k2) it.next();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) k2Var.getName());
                    s2.c(spannableStringBuilder, application, k2Var.getName(), k2Var.f(), 2132017459);
                    arrayList.add(new k.g(k2Var, spannableStringBuilder));
                }
            }
        }
        if (!z10) {
            set2 = set3;
        }
        Set<k2> l = f0.l(set2, set);
        if (!l.isEmpty()) {
            arrayList.add(new k.e(2131954898));
            for (k2 k2Var2 : l) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) k2Var2.getName());
                s2.c(spannableStringBuilder2, application, k2Var2.getName(), k2Var2.f(), 2132017459);
                arrayList.add(new k.f(k2Var2, spannableStringBuilder2));
            }
        }
        if (z11) {
            arrayList.add(new k.d(5, 2131952992));
        }
        return arrayList;
    }
}
