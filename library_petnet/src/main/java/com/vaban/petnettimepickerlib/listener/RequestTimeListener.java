package com.vaban.petnettimepickerlib.listener;

import com.vaban.petnettimepickerlib.model.TimePickerData;

/**
 * Created by vaban on 2/21/2016.
 */
public interface RequestTimeListener {

    public void onRequestTimeCompleted(TimePickerData data);
    public void onRequestTimeCancelled();

}
