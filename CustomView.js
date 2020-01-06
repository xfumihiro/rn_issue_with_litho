import React from 'react';
import {requireNativeComponent} from 'react-native';

const RNTCustomView = requireNativeComponent('RNTCustomView', CustomView, {});

function CustomView() {
  return <RNTCustomView />;
}

export default CustomView;
