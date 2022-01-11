import React, {Component} from 'react';
import {StyleSheet, View, requireNativeComponent} from 'react-native';

const Switch = requireNativeComponent('CustomWebView');

export default class App extends Component {
  render() {
    return (
      <View style={styles.container}>
        <Switch style={styles.javaBtn} />
      </View>
    );
  }
}
const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'pink',
    alignItems: 'center',
    justifyContent: 'center',
  },
  javaBtn: {
    height: 100,
    width: 300,
    backgroundColor: 'yellow',
  },
});