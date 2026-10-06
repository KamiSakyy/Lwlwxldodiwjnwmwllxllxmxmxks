package com.google.firebase.installations;

import c21.uShadow;
import com.google.firebase.FirebaseException;

/* loaded from: /home/user/work/p/classes4.dex */
public class FirebaseInstallationsException extends FirebaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseInstallationsException(String str) {
        super(str);
        uShadow.e(str, "Detail message must not be empty");
    }
}
