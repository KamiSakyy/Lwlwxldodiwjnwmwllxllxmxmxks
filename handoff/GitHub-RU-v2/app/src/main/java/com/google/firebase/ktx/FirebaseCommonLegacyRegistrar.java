package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p41.a;
import sy.d0Shadow;
import sy.oShadow;

@Keep
/* loaded from: /home/user/work/p/classes4.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        return d0Shadow.n(oShadow.c("fire-core-ktx", "21.0.0"));
    }
}
