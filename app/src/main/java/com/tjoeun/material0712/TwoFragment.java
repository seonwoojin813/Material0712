package com.tjoeun.material0712;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class TwoFragment extends DialogFragment {
    @Override
    //다이얼로그 출력을 위한 메소드
    public Dialog onCreateDialog(Bundle saveInstanceState){
        AlertDialog.Builder dlg = new AlertDialog.Builder(getActivity());
        dlg.setIcon(android.R.drawable.ic_dialog_alert);
        dlg.setTitle("대화상자");
        dlg.setMessage("DialogFragment");
        dlg.setPositiveButton("OK", null);
        return dlg.create();
    }
}
