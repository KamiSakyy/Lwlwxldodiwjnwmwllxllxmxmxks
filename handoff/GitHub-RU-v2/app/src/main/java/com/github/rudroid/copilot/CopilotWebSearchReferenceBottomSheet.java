package com.github.rudroid.copilot;

import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class CopilotWebSearchReferenceBottomSheet extends Hilt_CopilotWebSearchReferenceBottomSheet {
    public static final a Companion = new a();

    public static final class a {
    }

    @Override // com.github.rudroid.fragments.BaseComposeBottomSheetDialog
    public final com.github.rudroid.fragments.g0 D4() {
        com.github.rudroid.fragments.g0.Companion.getClass();
        return com.github.rudroid.fragments.g0.f13905v;
    }

    @Override // com.github.rudroid.fragments.BaseComposeBottomSheetDialog
    public final r1.d E4() {
        return new r1.d(new t(4, this), true, -63738466);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List I4() {
        ArrayList parcelableArrayList;
        int i = Build.VERSION.SDK_INT;
        x61.r rVar = x61.r.r;
        if (i > 33) {
            Bundle bundle = this.f2466x;
            parcelableArrayList = bundle != null ? bundle.getParcelableArrayList("key_results", xn.h4.class) : null;
            return parcelableArrayList == null ? rVar : parcelableArrayList;
        }
        Bundle bundle2 = this.f2466x;
        parcelableArrayList = bundle2 != null ? bundle2.getParcelableArrayList("key_results") : null;
        return parcelableArrayList == null ? rVar : parcelableArrayList;
    }
}
