import React, { Fragment } from 'react';
import PropTypes from 'prop-types';

export default class App extends React.Component {
    render(){
        let abc = 0;
        return(
            <div>
                <h1>Hello World</h1>
                <List aaa={"aksldjflkasd"}/>
                <App2 />
                <ul>
                    <FRAGMENT />
                    <Blank />
                    <Props name="asdkfjlk">메렁</Props>
                </ul>
                <ul>
                <Class />
                </ul>
            </div>
        )
    }
}

function App2() {
    return React.createElement("div", null, React.createElement("h1", null, "HelloWorld"));
}

// 리액트는 컴포넌트 단위
// 컴포넌트는 속성(props)과 상태(state) 값을 가진다.
class List extends React.Component {
    render() {
        let title1 = "글1";
        return (
            <ul>
                <li>{title1}</li>
                <li>글2</li>
                <li>글3</li>
                <li>글4</li>
                <li>글5</li>
            </ul>
        );
    }
}

// return 문장은 하나의 태그로 감싸 있어야 한다. v16? 에서 Fragment 가 생김
class FRAGMENT extends React.Component {
    render() {
        return (
            <Fragment>
                <li>글6</li>
                <li>글7</li>
            </Fragment>
        );
    }
}
// 최근에는 <> </> 로 사용한다.
class Blank extends React.Component {
    render() {
        return (
            <>
                <li>글8</li>
                <li>글9</li>
            </>
        );
    }
}

function Props (props) {
    const {name, children} = props;

    return (
        <>
            <li>{name}</li>
            <li>{children}</li>
        </>
    );
}

Props.defaultProps = {  //default Props 설정
    name: "default"
};

function Props2 ({name, children}) {
    return (
        <>
            <li>{name}</li>
            <li>{children}</li>
        </>
    );
}

Props2.propTypes = {
    name: PropTypes.string.isRequired
}


class Class extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            text: "test"
        }
    }

    render() {
        const {text} = this.state;

        const handleClick = () => {
            this.setState({
                text: "click"
            });
        }

        return (
            <>
                <li onClick={handleClick}>{text}</li>
            </>
        );
    }
}