import animationData from './animacao.json'

const defaultOptions = {
    loop: true,
    autoplay: true,
    isPaused: false,
    animationData: animationData,
    rendererSettings: {
        preserveAspectRatio: 'xMidYMid slice'
    }
}
export default defaultOptions;