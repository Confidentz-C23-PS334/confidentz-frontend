package com.confidents.app.modules.camera.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.confidents.app.modules.camera.`data`.model.CameraModel
import org.koin.core.KoinComponent

class CameraVM : ViewModel(), KoinComponent {
  val cameraModel: MutableLiveData<CameraModel> = MutableLiveData(CameraModel())

  var navArguments: Bundle? = null
}
