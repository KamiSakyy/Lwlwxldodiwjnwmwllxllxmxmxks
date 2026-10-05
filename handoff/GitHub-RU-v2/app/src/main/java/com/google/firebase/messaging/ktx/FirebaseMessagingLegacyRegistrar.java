package com.google.firebase.messaging.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p41.a;
import sy.d0;
import sy.o;

@Keep
/* loaded from: /home/user/work/p/classes4.dex */
public final class FirebaseMessagingLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        return d0.n(o.c("fire-fcm-ktx", "24.1.2"));
    }
}
